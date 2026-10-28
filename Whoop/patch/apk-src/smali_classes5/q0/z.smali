.class public final synthetic Lq0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(FILc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lq0/z;->w:I

    iput p1, p0, Lq0/z;->x:F

    iput-object p3, p0, Lq0/z;->y:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lq0/b;

    iget v1, p0, Lq0/z;->x:F

    iget v2, p0, Lq0/z;->w:I

    iget-object v3, p0, Lq0/z;->y:Lc93/a;

    invoke-direct {v0, v1, v2, v3}, Lq0/b;-><init>(FILc93/a;)V

    return-object v0
.end method
