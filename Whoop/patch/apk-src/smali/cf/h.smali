.class public final Lcf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/f;


# instance fields
.field public final a:Ljc/b0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljc/b0;

    new-instance v1, La11/g;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    sget-object v2, Leg/o;->b:Lqt/e;

    invoke-direct {v0, v2, v1}, Ljc/b0;-><init>(Lvg/g;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcf/h;->a:Ljc/b0;

    return-void
.end method


# virtual methods
.method public final a()Lcf/g;
    .locals 2

    new-instance v0, Laj/d;

    iget-object v1, p0, Lcf/h;->a:Ljc/b0;

    iget-object v1, v1, Ljc/b0;->g:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leg/o;

    invoke-direct {v0, v1}, Laj/d;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final h(Leg/o;)V
    .locals 1

    iget-object v0, p0, Lcf/h;->a:Ljc/b0;

    invoke-virtual {v0, p1}, Ljc/b0;->a(Ljava/lang/Object;)V

    return-void
.end method
