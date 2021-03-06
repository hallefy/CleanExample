package testing.data.repository.datasource;

import java.util.List;

import rx.Observable;
import testing.data.entity.UserEntity;
import testing.data.net.UserService;

/**
 * Created by Uri Abad on 29/09/2016.
 * Seidor S.A.
 * oabad@seidor.es
 */

public class CloudUserDataStore implements UserDataStore {

    private final UserService userService;

    public CloudUserDataStore(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Observable<List<UserEntity>> userEntityList() {
        return this.userService.getUsers();
    }

    @Override
    public Observable<UserEntity> userEntityDetails(final int userId) {
        return null;
    }
}
