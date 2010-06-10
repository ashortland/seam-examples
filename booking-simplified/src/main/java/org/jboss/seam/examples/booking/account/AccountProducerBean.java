package org.jboss.seam.examples.booking.account;

import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.seam.examples.booking.model.User;
import org.slf4j.Logger;

/**
 * @author Dan Allen
 */
@Stateless
public class AccountProducerBean implements AccountProducer
{
   @Inject
   private Logger log;

   @PersistenceContext
   private EntityManager em;

   public @Produces
   @Registered
   @Named("currentUser")
   @SessionScoped
   User getCurrentAccount()
   {
      log.info("Producing dummy User");
      return new User("Current User", "CurrentUser");
   }
}
