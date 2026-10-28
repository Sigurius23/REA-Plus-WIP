.class public final synthetic Lor2/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;


# instance fields
.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/f0;->w:Ljava/util/List;

    iput-object p2, p0, Lor2/f0;->x:Ljava/util/List;

    iput p3, p0, Lor2/f0;->y:I

    iput p4, p0, Lor2/f0;->z:I

    return-void
.end method


# virtual methods
.method public final o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 6

    iget v2, p0, Lor2/f0;->y:I

    iget v3, p0, Lor2/f0;->z:I

    iget-object v0, p0, Lor2/f0;->w:Ljava/util/List;

    iget-object v1, p0, Lor2/f0;->x:Ljava/util/List;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lor2/g0;->b(Ljava/util/List;Ljava/util/List;IILandroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1
.end method
