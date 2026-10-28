.class public final Leb/o;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final w:Landroidx/lifecycle/k1;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k1;)V
    .locals 1

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Leb/o;->w:Landroidx/lifecycle/k1;

    return-void
.end method


# virtual methods
.method public final g()Landroidx/lifecycle/k1;
    .locals 1

    iget-object v0, p0, Leb/o;->w:Landroidx/lifecycle/k1;

    return-object v0
.end method
