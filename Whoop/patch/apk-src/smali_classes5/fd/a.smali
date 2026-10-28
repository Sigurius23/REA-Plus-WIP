.class public final Lfd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;I)V
    .locals 1

    packed-switch p2, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfd/a;->a:Ljava/util/List;

    const-string p1, "smithy.api#noAuth"

    invoke-static {p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v0, "GetRoleCredentials"

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lfd/a;->b:Ljava/util/Map;

    const/4 p1, 0x0

    const/16 p2, 0x1f

    invoke-static {p2, p1}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfd/a;->c:Ljava/util/List;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfd/a;->a:Ljava/util/List;

    const-string p1, "smithy.api#noAuth"

    invoke-static {p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v0, "CreateOAuth2Token"

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lfd/a;->b:Ljava/util/Map;

    const/4 p1, 0x0

    const/16 p2, 0x1f

    invoke-static {p2, p1}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfd/a;->c:Ljava/util/List;

    return-void

    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfd/a;->a:Ljava/util/List;

    const-string p1, "smithy.api#noAuth"

    invoke-static {p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v0, "AssumeRoleWithWebIdentity"

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lfd/a;->b:Ljava/util/Map;

    const/4 p1, 0x0

    const/16 p2, 0x1f

    invoke-static {p2, p1}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfd/a;->c:Ljava/util/List;

    return-void

    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfd/a;->a:Ljava/util/List;

    const-string p1, "smithy.api#noAuth"

    invoke-static {p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v0, "CreateToken"

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lfd/a;->b:Ljava/util/Map;

    const/4 p1, 0x0

    const/16 p2, 0x1f

    invoke-static {p2, p1}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfd/a;->c:Ljava/util/List;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
