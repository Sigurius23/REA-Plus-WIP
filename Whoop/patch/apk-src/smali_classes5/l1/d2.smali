.class public final Ll1/d2;
.super Lg/t;
.source "SourceFile"


# instance fields
.field public final d:Lbc3/c0;

.field public final e:Ld0/e;

.field public final f:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;


# direct methods
.method public constructor <init>(ZLbc3/c0;Ld0/e;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    iput-object p2, p0, Ll1/d2;->d:Lbc3/c0;

    iput-object p3, p0, Ll1/d2;->e:Ld0/e;

    iput-object p4, p0, Ll1/d2;->f:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    new-instance v0, Lkd/f;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    iget-object v3, p0, Ll1/d2;->d:Lbc3/c0;

    invoke-static {v3, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Ll1/d2;->f:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final e(Lg/a;)V
    .locals 3

    new-instance v0, Ll1/c2;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Ll1/c2;-><init>(Ll1/d2;Lg/a;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, Ll1/d2;->d:Lbc3/c0;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final f(Lg/a;)V
    .locals 3

    new-instance v0, Ll1/c2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Ll1/c2;-><init>(Ll1/d2;Lg/a;Lq83/d;I)V

    const/4 p1, 0x3

    iget-object v1, p0, Ll1/d2;->d:Lbc3/c0;

    invoke-static {v1, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
