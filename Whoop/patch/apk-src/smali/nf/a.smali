.class public final Lnf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnf/e;


# static fields
.field public static final a:Lnf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnf/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lnf/a;->a:Lnf/a;

    return-void
.end method


# virtual methods
.method public final a(Lxf/f;)Lxf/c;
    .locals 1

    const-string v0, "identityProviderConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lnf/d;->w:Lnf/d;

    return-object p1
.end method

.method public final b()Lnf/i;
    .locals 1

    sget-object v0, Lnf/b;->a:Lnf/b;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "smithy.api#noAuth"

    return-object v0
.end method
