.class public final synthetic Lu30/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/util/Set;

.field public final synthetic G:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field public final synthetic H:I

.field public final synthetic w:Lg40/i1;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lg40/i1;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu30/d;->w:Lg40/i1;

    iput p2, p0, Lu30/d;->x:I

    iput p3, p0, Lu30/d;->y:I

    iput-boolean p4, p0, Lu30/d;->z:Z

    iput-boolean p5, p0, Lu30/d;->E:Z

    iput-object p6, p0, Lu30/d;->F:Ljava/util/Set;

    iput-object p7, p0, Lu30/d;->G:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p8, p0, Lu30/d;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lu30/d;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Lu30/d;->w:Lg40/i1;

    iget v1, p0, Lu30/d;->x:I

    iget v2, p0, Lu30/d;->y:I

    iget-boolean v3, p0, Lu30/d;->z:Z

    iget-boolean v4, p0, Lu30/d;->E:Z

    iget-object v5, p0, Lu30/d;->F:Ljava/util/Set;

    iget-object v6, p0, Lu30/d;->G:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static/range {v0 .. v8}, Ls4/l;->c(Lg40/i1;IIZZLjava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
