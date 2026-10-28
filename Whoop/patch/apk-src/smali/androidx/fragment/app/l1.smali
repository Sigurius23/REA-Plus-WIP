.class public final Landroidx/fragment/app/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/k1;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final synthetic d:Landroidx/fragment/app/o1;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o1;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/l1;->d:Landroidx/fragment/app/o1;

    iput-object p2, p0, Landroidx/fragment/app/l1;->a:Ljava/lang/String;

    iput p3, p0, Landroidx/fragment/app/l1;->b:I

    iput p4, p0, Landroidx/fragment/app/l1;->c:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 9

    iget-object v0, p0, Landroidx/fragment/app/l1;->d:Landroidx/fragment/app/o1;

    iget-object v0, v0, Landroidx/fragment/app/o1;->A:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_0

    iget v1, p0, Landroidx/fragment/app/l1;->b:I

    if-gez v1, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/l1;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getChildFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/o1;->U(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    iget v7, p0, Landroidx/fragment/app/l1;->b:I

    iget v8, p0, Landroidx/fragment/app/l1;->c:I

    iget-object v3, p0, Landroidx/fragment/app/l1;->d:Landroidx/fragment/app/o1;

    iget-object v6, p0, Landroidx/fragment/app/l1;->a:Ljava/lang/String;

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v3 .. v8}, Landroidx/fragment/app/o1;->V(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p1

    return p1
.end method
