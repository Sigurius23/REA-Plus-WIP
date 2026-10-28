.class public final synthetic Ly21/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:I

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FFFILkotlin/jvm/functions/Function1;Lc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly21/e;->w:F

    iput p2, p0, Ly21/e;->x:F

    iput p3, p0, Ly21/e;->y:F

    iput p4, p0, Ly21/e;->z:I

    iput-object p5, p0, Ly21/e;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ly21/e;->F:Lc93/a;

    iput p7, p0, Ly21/e;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v6, p0, Ly21/e;->G:I

    move-object v7, p1

    check-cast v7, Li3/z;

    iget v0, p0, Ly21/e;->w:F

    iget v1, p0, Ly21/e;->x:F

    iget v2, p0, Ly21/e;->y:F

    iget v3, p0, Ly21/e;->z:I

    iget-object v4, p0, Ly21/e;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ly21/e;->F:Lc93/a;

    invoke-static/range {v0 .. v7}, Ly21/i;->i(FFFILkotlin/jvm/functions/Function1;Lc93/a;ILi3/z;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
