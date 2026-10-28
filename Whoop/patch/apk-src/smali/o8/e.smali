.class public Lo8/e;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# static fields
.field public static final y:Landroidx/fragment/app/s1;


# instance fields
.field public final w:La0/g1;

.field public x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/fragment/app/s1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/fragment/app/s1;-><init>(I)V

    sput-object v0, Lo8/e;->y:Landroidx/fragment/app/s1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    new-instance v0, La0/g1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/g1;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo8/e;->w:La0/g1;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo8/e;->x:Z

    return-void
.end method


# virtual methods
.method public final onCleared()V
    .locals 6

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    iget-object v0, p0, Lo8/e;->w:La0/g1;

    invoke-virtual {v0}, La0/g1;->g()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-virtual {v0, v3}, La0/g1;->h(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo8/c;

    invoke-virtual {v4}, Lo8/c;->b()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget v1, v0, La0/g1;->z:I

    iget-object v3, v0, La0/g1;->y:[Ljava/lang/Object;

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_1

    const/4 v5, 0x0

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iput v2, v0, La0/g1;->z:I

    iput-boolean v2, v0, La0/g1;->w:Z

    return-void
.end method
