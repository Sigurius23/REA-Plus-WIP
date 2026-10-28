.class public final Landroidx/viewpager2/adapter/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Landroidx/viewpager2/adapter/i;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/adapter/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/viewpager2/adapter/b;->w:Landroidx/viewpager2/adapter/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/viewpager2/adapter/b;->w:Landroidx/viewpager2/adapter/i;

    iput-boolean v0, v1, Landroidx/viewpager2/adapter/i;->mIsInGracePeriod:Z

    invoke-virtual {v1}, Landroidx/viewpager2/adapter/i;->gcFragments()V

    return-void
.end method
