package abstract_factory;

import abstract_factory.account.RepositoryAccount;
import abstract_factory.account.RepositoryAccountBDR;
import abstract_factory.client.RepositoryClient;
import abstract_factory.client.RepositoryClientBDR;

class FactoryRepositoryBDR implements FactoryRepository {

  public RepositoryAccount makeRepAccount() {
    return new RepositoryAccountBDR();
  }

  public RepositoryClient makeRepClient() {
    return new RepositoryClientBDR();
  }
}
