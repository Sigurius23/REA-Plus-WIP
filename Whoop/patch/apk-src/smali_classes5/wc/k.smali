.class public final Lwc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/l;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/k;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ldg/a;Ljava/lang/Object;)Lvf/b;
    .locals 1

    check-cast p2, Ll83/a0;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "input"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lvf/b;

    invoke-direct {p1}, Lvf/b;-><init>()V

    iget-object p2, p1, Lvf/b;->x:Lcg/j;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "Accept"

    const-string v0, "application/json"

    invoke-static {p1, p2, v0}, Ls93/h;->q(Lvf/b;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "Accept-Encoding"

    const-string v0, "identity"

    invoke-static {p1, p2, v0}, Ls93/h;->q(Lvf/b;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lwc/k;->a:Ljava/lang/String;

    if-eqz p2, :cond_0

    const-string v0, "Authorization"

    invoke-static {p1, v0, p2}, Ls93/h;->q(Lvf/b;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method
