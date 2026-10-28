.class public final Lqc/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:Lqc/b;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/e;->a:Landroidx/room/z0;

    new-instance p1, Lqc/b;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lqc/b;-><init>(I)V

    iput-object p1, p0, Lqc/e;->b:Lqc/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Long;
    .locals 3

    new-instance v0, Le61/g;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Le61/g;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lqc/e;->a:Landroidx/room/z0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    return-object p1
.end method

.method public final b(Lqc/d;)V
    .locals 3

    new-instance v0, Lp3/b0;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lqc/e;->a:Landroidx/room/z0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method
