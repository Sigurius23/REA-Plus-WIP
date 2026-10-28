.class public final Lf1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/f;


# static fields
.field public static final b:Lf1/w;

.field public static final c:Lf1/w;

.field public static final d:Lf1/v;

.field public static final e:Lf1/v;

.field public static final f:Lf1/v;

.field public static final g:Lf1/v;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lf1/w;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf1/w;-><init>(I)V

    sput-object v0, Lf1/w;->b:Lf1/w;

    new-instance v0, Lf1/w;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf1/w;-><init>(I)V

    sput-object v0, Lf1/w;->c:Lf1/w;

    new-instance v0, Lf1/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf1/v;-><init>(I)V

    sput-object v0, Lf1/w;->d:Lf1/v;

    new-instance v0, Lf1/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf1/v;-><init>(I)V

    sput-object v0, Lf1/w;->e:Lf1/v;

    new-instance v0, Lf1/v;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lf1/v;-><init>(I)V

    sput-object v0, Lf1/w;->f:Lf1/v;

    new-instance v0, Lf1/v;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lf1/v;-><init>(I)V

    sput-object v0, Lf1/w;->g:Lf1/v;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf1/w;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lf1/r;I)J
    .locals 1

    iget v0, p0, Lf1/w;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lf1/r;->f:Ll3/r0;

    invoke-virtual {p1, p2}, Ll3/r0;->k(I)J

    move-result-wide p1

    return-wide p1

    :pswitch_0
    iget-object p1, p1, Lf1/r;->f:Ll3/r0;

    iget-object p1, p1, Ll3/r0;->a:Ll3/q0;

    iget-object p1, p1, Ll3/q0;->a:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-static {p2, p1}, Lu0/n0;->o(ILjava/lang/CharSequence;)I

    move-result v0

    invoke-static {p2, p1}, Lu0/n0;->n(ILjava/lang/CharSequence;)I

    move-result p1

    invoke-static {v0, p1}, Lj93/l0;->f(II)J

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
