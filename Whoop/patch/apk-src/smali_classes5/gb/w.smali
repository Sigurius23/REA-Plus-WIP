.class public final Lgb/w;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lgb/w;

.field public static final y:Lgb/w;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lgb/w;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgb/w;-><init>(II)V

    sput-object v0, Lgb/w;->x:Lgb/w;

    new-instance v0, Lgb/w;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgb/w;-><init>(II)V

    sput-object v0, Lgb/w;->y:Lgb/w;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lgb/w;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lgb/w;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/q;

    const/4 p1, 0x0

    const/4 v0, 0x6

    const/16 v1, 0x2bc

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/q;

    const/4 p1, 0x0

    const/4 v0, 0x6

    const/16 v1, 0x2bc

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
