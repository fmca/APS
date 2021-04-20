package abstract_factory;

import abstract_factory.account.RepositoryAccount;
import abstract_factory.client.RepositoryClient;

interface FactoryRepository {

  RepositoryAccount makeRepAccount();

  RepositoryClient makeRepClient();
}
