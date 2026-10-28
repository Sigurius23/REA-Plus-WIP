package com.whoop.domain.exception;

import com.whoop.network.exception.DomainException;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lcom/whoop/domain/exception/InviteCodeException;", "Lcom/whoop/network/exception/DomainException;", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InviteCodeException extends DomainException {

    /* JADX INFO: renamed from: com.whoop.domain.exception.InviteCodeException$a */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/domain/exception/InviteCodeException$a;", "Lcom/whoop/network/exception/DomainException$b;", "", "<init>", "(Ljava/lang/String;I)V", "COMMUNITY_CODE_NOT_VALID", "CODE_NOT_VALID", "CODE_TYPE_MISMATCH", "EMPTY_BODY", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum EnumC8700a implements DomainException.InterfaceC9606b {
        COMMUNITY_CODE_NOT_VALID,
        CODE_NOT_VALID,
        CODE_TYPE_MISMATCH,
        EMPTY_BODY;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }
}
