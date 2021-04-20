package abstract_factory;

import abstract_factory.account.RepositoryAccount;
import abstract_factory.client.RepositoryClient;

class Client {

  private RepositoryAccount repAcc;
  private RepositoryClient repClient;

  public void initClient() {

    FactoryRepository fr = null;
    // Read some config file
    // if config.repository == bdr
    // fr = new FactoryRepositoryBDR();
    initReps(fr);
  }

  public void initReps(final FactoryRepository fac) {
    this.repAcc = fac.makeRepAccount();
    this.repClient = fac.makeRepClient();
  }
}
