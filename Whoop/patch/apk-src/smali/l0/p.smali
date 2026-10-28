.class public final Ll0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# static fields
.field public static final b:Ll0/p;

.field public static final c:Ll0/p;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ll0/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll0/p;-><init>(I)V

    sput-object v0, Ll0/p;->b:Ll0/p;

    new-instance v0, Ll0/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll0/p;-><init>(I)V

    sput-object v0, Ll0/p;->c:Ll0/p;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll0/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 2

    iget p2, p0, Ll0/p;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-static {p3, p4}, Ly3/a;->g(J)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result p2

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    invoke-static {p3, p4}, Ly3/a;->f(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result v0

    :cond_1
    new-instance p3, Ldc1/c;

    const/16 p4, 0x1b

    invoke-direct {p3, p4}, Ldc1/c;-><init>(I)V

    sget-object p4, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p2, v0, p4, p3}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p3, p4}, Ly3/a;->k(J)I

    move-result p2

    invoke-static {p3, p4}, Ly3/a;->j(J)I

    move-result p3

    new-instance p4, Ldc1/c;

    const/16 v0, 0x1b

    invoke-direct {p4, v0}, Ldc1/c;-><init>(I)V

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p2, p3, v0, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
