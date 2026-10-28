.class public final Llb3/o0;
.super Ls2/e;
.source "SourceFile"


# static fields
.field public static final b:Llb3/o0;

.field public static final c:Llb3/o0;

.field public static final d:Llb3/o0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Llb3/o0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llb3/o0;-><init>(I)V

    sput-object v0, Llb3/o0;->b:Llb3/o0;

    new-instance v0, Llb3/o0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb3/o0;-><init>(I)V

    sput-object v0, Llb3/o0;->c:Llb3/o0;

    new-instance v0, Llb3/o0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb3/o0;-><init>(I)V

    sput-object v0, Llb3/o0;->d:Llb3/o0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llb3/o0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i0(Llb3/p0;Lob3/g;)Lob3/h;
    .locals 1

    iget v0, p0, Llb3/o0;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Llb3/p0;->c:Lob3/o;

    invoke-interface {p1, p2}, Lob3/o;->l0(Lob3/g;)Lob3/h;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "type"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Should not be called"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Llb3/p0;->c:Lob3/o;

    invoke-interface {p1, p2}, Lob3/o;->f(Lob3/g;)Lob3/h;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
