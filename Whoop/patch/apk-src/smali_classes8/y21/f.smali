.class public final synthetic Ly21/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:I

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lc93/a;IFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly21/f;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ly21/f;->x:Lc93/a;

    iput p3, p0, Ly21/f;->y:I

    iput p4, p0, Ly21/f;->z:F

    iput p5, p0, Ly21/f;->E:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    iget-object v0, p0, Ly21/f;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ly21/f;->x:Lc93/a;

    iget v2, p0, Ly21/f;->y:I

    iget v3, p0, Ly21/f;->z:F

    iget v4, p0, Ly21/f;->E:F

    invoke-static/range {v0 .. v5}, Ly21/i;->d(Lkotlin/jvm/functions/Function1;Lc93/a;IFFF)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
