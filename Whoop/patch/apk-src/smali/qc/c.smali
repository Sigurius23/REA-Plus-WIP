.class public final Lqc/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:Lqc/b;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/c;->a:Landroidx/room/z0;

    new-instance p1, Lqc/b;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lqc/b;-><init>(I)V

    iput-object p1, p0, Lqc/c;->b:Lqc/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le61/g;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Le61/g;-><init>(Ljava/lang/String;I)V

    iget-object p1, p0, Lqc/c;->a:Landroidx/room/z0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
