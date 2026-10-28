.class public final Lbm/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Lbm/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbm/l;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lbm/l;->w:Lbm/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lx03/b;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "layoutInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v0, p2, -0x1

    add-int/lit8 p2, p2, 0x1

    invoke-static {p3, v0, p2}, Le93/b;->n(III)I

    move-result p2

    iget-object p1, p1, Lx03/b;->a:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->h()Ln0/n;

    move-result-object p1

    iget p1, p1, Ln0/n;->n:I

    add-int/lit8 p1, p1, -0x1

    const/4 p3, 0x0

    invoke-static {p2, p3, p1}, Le93/b;->n(III)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
