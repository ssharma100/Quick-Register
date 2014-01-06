import com.real.estate.User
import org.apache.shiro.crypto.hash.Sha512Hash


class BootStrap {

    def init = { servletContext ->
        def user1 = new User(username: "admin", passwordHash: "ee6dc235b62eb3bbb6d90c6a644b3d4655bdacd35904a877d5ac0c4c3ef1107bc1657d827c2c5acc11df43039bd8465edb95a0f10ceb4a8b7eca0bd9bc6d1028")
        user1.addToPermissions("*:*")
        user1.save()

        def user2 = new User(username: "ksharma", passwordHash: "2f7000898bc5ac9e4b49ef9ec788165bcb6846a769d5dfe73dd30d1e67ae927a54bf0b53e53f6ddb2d758936f508c2f1fdfec613dbe1a237d3a0e998735e67a2")
        user2.addToPermissions("*:*")
        user2.save()

        def user3 = new User(username: "lsharma", passwordHash: "403d1b200db6401c6ce313d6e9b89023cdc8b95a46583eaa153155b33eef04d2ff6a9cccad4c5610d5e73cbf39c2fd8db77058932d5b8febc1e5a1d4231bfcab")
        user3.addToPermissions("*:*")
        user3.save()

        def user4 = new User(username: "isharma", passwordHash: "b85ed5980356bc7323596812e2af4c2d5af0a7744eb2f8ce75be948a0246e5e076f3b41adef71f4aee2b43ab250a20432aef6a885fee1ea282d6cc71d6c91336")
        user4.addToPermissions("*:*")
        user4.save()

        def user5 = new User(username: "ssharma", passwordHash: "4977de087d981f36e702c972d4470c35ba980892ecc493f546cce7b87c94fdb6d294e15982517e16e91deb7e41fc7f289b00375c3cb27ef0eaddd8c76376469c")
        user5.addToPermissions("*:*")
        user5.save()
    }
    def destroy = {
    }
}
