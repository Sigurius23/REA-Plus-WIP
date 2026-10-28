.class public final synthetic Lg1/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lc93/a;)V
    .locals 0

    iput p1, p0, Lg1/g2;->w:I

    iput-object p2, p0, Lg1/g2;->x:Ljava/lang/String;

    iput-object p3, p0, Lg1/g2;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lg1/g2;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lg1/g2;->y:Lc93/a;

    iget-object v3, p0, Lg1/g2;->x:Ljava/lang/String;

    check-cast p1, Li3/z;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->s:Li3/y;

    sget-object v4, Li3/w;->a:[Lj93/z;

    const/16 v5, 0xa

    aget-object v4, v4, v5

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v0, p1, v4}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    invoke-static {v3, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    new-instance v0, Liy0/a;

    const/16 v3, 0x16

    invoke-direct {v0, v2, v3}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-static {p1, v0}, Li3/w;->c(Li3/z;Lc93/a;)V

    return-object v1

    :pswitch_0
    invoke-static {v3, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    new-instance v0, Ld42/o;

    const/16 v3, 0x1b

    invoke-direct {v0, v2, v3}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-static {p1, v0}, Li3/w;->c(Li3/z;Lc93/a;)V

    return-object v1

    :pswitch_1
    invoke-static {v3, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    new-instance v0, Ld42/o;

    const/16 v3, 0x1a

    invoke-direct {v0, v2, v3}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-static {p1, v0}, Li3/w;->c(Li3/z;Lc93/a;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
