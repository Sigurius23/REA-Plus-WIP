.class public final Lqc/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:Lqc/b;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/i;->a:Landroidx/room/z0;

    new-instance p1, Lqc/b;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lqc/b;-><init>(I)V

    iput-object p1, p0, Lqc/i;->b:Lqc/b;

    return-void
.end method


# virtual methods
.method public a(Lqc/j;)Lqc/h;
    .locals 3

    iget-object v0, p1, Lqc/j;->a:Ljava/lang/String;

    iget p1, p1, Lqc/j;->b:I

    const-string v1, "workSpecId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/h;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/h;-><init>(Ljava/lang/String;II)V

    iget-object p1, p0, Lqc/i;->a:Landroidx/room/z0;

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqc/h;

    return-object p1
.end method
