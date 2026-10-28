.class public final Lm83/k0;
.super Lm83/b;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lm83/l0;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lm83/l0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm83/k0;->E:Lm83/l0;

    iget v0, p1, Lm83/l0;->z:I

    iput v0, p0, Lm83/k0;->y:I

    iget p1, p1, Lm83/l0;->y:I

    iput p1, p0, Lm83/k0;->z:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget v0, p0, Lm83/k0;->y:I

    if-nez v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lm83/b;->w:I

    return-void

    :cond_0
    iget-object v1, p0, Lm83/k0;->E:Lm83/l0;

    iget-object v2, v1, Lm83/l0;->w:[Ljava/lang/Object;

    iget v3, p0, Lm83/k0;->z:I

    aget-object v2, v2, v3

    iput-object v2, p0, Lm83/b;->x:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lm83/b;->w:I

    add-int/2addr v3, v2

    iget v1, v1, Lm83/l0;->x:I

    rem-int/2addr v3, v1

    iput v3, p0, Lm83/k0;->z:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lm83/k0;->y:I

    return-void
.end method
