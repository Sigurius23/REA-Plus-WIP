.class public final synthetic Lz71/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic G:I

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Li2/t;


# direct methods
.method public synthetic constructor <init>(FFFLi2/t;FFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz71/i;->w:F

    iput p2, p0, Lz71/i;->x:F

    iput p3, p0, Lz71/i;->y:F

    iput-object p4, p0, Lz71/i;->z:Li2/t;

    iput p5, p0, Lz71/i;->E:F

    iput p6, p0, Lz71/i;->F:F

    iput p7, p0, Lz71/i;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v6, p0, Lz71/i;->G:I

    move-object v7, p1

    check-cast v7, Lk2/e;

    iget v0, p0, Lz71/i;->w:F

    iget v1, p0, Lz71/i;->x:F

    iget v2, p0, Lz71/i;->y:F

    iget-object v3, p0, Lz71/i;->z:Li2/t;

    iget v4, p0, Lz71/i;->E:F

    iget v5, p0, Lz71/i;->F:F

    invoke-static/range {v0 .. v7}, Lz71/l;->i(FFFLi2/t;FFILk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
