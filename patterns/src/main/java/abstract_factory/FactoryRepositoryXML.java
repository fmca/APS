package abstract_factory;

import abstract_factory.account.RepositoryAccount;
import abstract_factory.account.RepositoryAccountXML;
import abstract_factory.client.RepositoryClient;
import abstract_factory.client.RepositoryClientXML;

class FactoryRepositoryXML implements FactoryRepository {

  public RepositoryAccount makeRepAccount() {
    return new RepositoryAccountXML();
  }

  public RepositoryClient makeRepClient() {
    return new RepositoryClientXML();
  }
}
