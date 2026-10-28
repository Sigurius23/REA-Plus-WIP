.class public final synthetic Lz71/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Li2/t;

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Li2/t;FFFI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz71/k;->w:Li2/t;

    iput p2, p0, Lz71/k;->x:F

    iput p3, p0, Lz71/k;->y:F

    iput p4, p0, Lz71/k;->z:F

    iput p5, p0, Lz71/k;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v4, p0, Lz71/k;->E:I

    move-object v5, p1

    check-cast v5, Lk2/e;

    iget-object v0, p0, Lz71/k;->w:Li2/t;

    iget v1, p0, Lz71/k;->x:F

    iget v2, p0, Lz71/k;->y:F

    iget v3, p0, Lz71/k;->z:F

    invoke-static/range {v0 .. v5}, Lz71/l;->g(Li2/t;FFFILk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
