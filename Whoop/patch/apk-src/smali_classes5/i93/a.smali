.class public abstract Li93/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# instance fields
.field public final w:C

.field public final x:C

.field public final y:I


# direct methods
.method public constructor <init>(CC)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Li93/a;->w:C

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lj93/l0;->F(III)I

    move-result p1

    int-to-char p1, p1

    iput-char p1, p0, Li93/a;->x:C

    iput v0, p0, Li93/a;->y:I

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    new-instance v0, Li93/b;

    iget-char v1, p0, Li93/a;->x:C

    iget v2, p0, Li93/a;->y:I

    iget-char v3, p0, Li93/a;->w:C

    invoke-direct {v0, v3, v1, v2}, Li93/b;-><init>(CCI)V

    return-object v0
.end method
