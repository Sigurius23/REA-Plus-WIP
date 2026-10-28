.class public final Li3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final x:Li3/g;

.field public static final y:Li3/g;

.field public static final z:Li3/g;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Li3/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li3/g;-><init>(I)V

    sput-object v0, Li3/g;->x:Li3/g;

    new-instance v0, Li3/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li3/g;-><init>(I)V

    sput-object v0, Li3/g;->y:Li3/g;

    new-instance v0, Li3/g;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Li3/g;-><init>(I)V

    sput-object v0, Li3/g;->z:Li3/g;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Li3/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, Li3/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll83/k;

    check-cast p2, Ll83/k;

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lh2/c;

    iget v0, v0, Lh2/c;->b:F

    iget-object v1, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lh2/c;

    iget v1, v1, Lh2/c;->b:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Lh2/c;

    iget p1, p1, Lh2/c;->d:F

    iget-object p2, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Lh2/c;

    iget p2, p2, Lh2/c;->d:F

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    :goto_0
    return v0

    :pswitch_0
    check-cast p1, Li3/p;

    check-cast p2, Li3/p;

    invoke-virtual {p1}, Li3/p;->h()Lh2/c;

    move-result-object p1

    invoke-virtual {p2}, Li3/p;->h()Lh2/c;

    move-result-object p2

    iget v0, p2, Lh2/c;->c:F

    iget v1, p1, Lh2/c;->c:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p1, Lh2/c;->b:F

    iget v1, p2, Lh2/c;->b:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget v0, p1, Lh2/c;->d:F

    iget v1, p2, Lh2/c;->d:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    iget p2, p2, Lh2/c;->a:F

    iget p1, p1, Lh2/c;->a:F

    invoke-static {p2, p1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    :goto_1
    return v0

    :pswitch_1
    check-cast p1, Li3/p;

    check-cast p2, Li3/p;

    invoke-virtual {p1}, Li3/p;->h()Lh2/c;

    move-result-object p1

    invoke-virtual {p2}, Li3/p;->h()Lh2/c;

    move-result-object p2

    iget v0, p1, Lh2/c;->a:F

    iget v1, p2, Lh2/c;->a:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    iget v0, p1, Lh2/c;->b:F

    iget v1, p2, Lh2/c;->b:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    iget v0, p1, Lh2/c;->d:F

    iget v1, p2, Lh2/c;->d:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    iget p1, p1, Lh2/c;->c:F

    iget p2, p2, Lh2/c;->c:F

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    :goto_2
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
