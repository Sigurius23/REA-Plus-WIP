.class public final Li3/a0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Li3/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li3/a0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Li3/a0;->w:Li3/a0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Li3/p;

    check-cast p2, Li3/p;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget-object p1, p1, Li3/p;->d:Li3/l;

    sget-object v1, Li3/u;->s:Li3/y;

    iget-object p1, p1, Li3/l;->w:La0/v0;

    invoke-virtual {p1, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    move-object p1, v0

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p2, p2, Li3/p;->d:Li3/l;

    iget-object p2, p2, Li3/l;->w:La0/v0;

    invoke-virtual {p2, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
