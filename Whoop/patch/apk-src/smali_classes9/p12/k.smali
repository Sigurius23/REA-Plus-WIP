.class public final synthetic Lp12/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp12/k;->w:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lu2/r;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v0, p0, Lp12/k;->w:Lp1/c1;

    invoke-static {v0, p1, p2}, Lp12/l$a;->a(Lp1/c1;Lu2/r;F)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
