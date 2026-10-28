.class public final Lb3/v2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b2;


# instance fields
.field public E:Li3/j;

.field public F:Li3/j;

.field public final w:I

.field public final x:Ljava/util/List;

.field public y:Ljava/lang/Float;

.field public z:Ljava/lang/Float;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb3/v2;->w:I

    iput-object p1, p0, Lb3/v2;->x:Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, p0, Lb3/v2;->y:Ljava/lang/Float;

    iput-object p1, p0, Lb3/v2;->z:Ljava/lang/Float;

    iput-object p1, p0, Lb3/v2;->E:Li3/j;

    iput-object p1, p0, Lb3/v2;->F:Li3/j;

    return-void
.end method


# virtual methods
.method public final U()Z
    .locals 1

    iget-object v0, p0, Lb3/v2;->x:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final a()I
    .locals 1

    iget v0, p0, Lb3/v2;->w:I

    return v0
.end method

.method public final b(Li3/j;)V
    .locals 0

    iput-object p1, p0, Lb3/v2;->E:Li3/j;

    return-void
.end method

.method public final c(Li3/j;)V
    .locals 0

    iput-object p1, p0, Lb3/v2;->F:Li3/j;

    return-void
.end method
