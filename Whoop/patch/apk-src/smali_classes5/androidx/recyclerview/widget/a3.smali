.class public final Landroidx/recyclerview/widget/a3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lg5/e;


# instance fields
.field public a:I

.field public b:Landroidx/recyclerview/widget/o1;

.field public c:Landroidx/recyclerview/widget/o1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg5/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lg5/e;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/a3;->d:Lg5/e;

    return-void
.end method

.method public static a()Landroidx/recyclerview/widget/a3;
    .locals 1

    sget-object v0, Landroidx/recyclerview/widget/a3;->d:Lg5/e;

    invoke-virtual {v0}, Lg5/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/a3;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/a3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    return-object v0
.end method
