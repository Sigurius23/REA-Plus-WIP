.class public final Lw23/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lw23/a;

.field public static final y:Lw23/a;

.field public static final z:Lw23/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lw23/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw23/a;-><init>(II)V

    sput-object v0, Lw23/a;->x:Lw23/a;

    new-instance v0, Lw23/a;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw23/a;-><init>(II)V

    sput-object v0, Lw23/a;->y:Lw23/a;

    new-instance v0, Lw23/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lw23/a;-><init>(II)V

    sput-object v0, Lw23/a;->z:Lw23/a;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lw23/a;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lw23/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ld33/h1;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ld33/h1;->z:Lec3/h2;

    return-object p1

    :pswitch_0
    check-cast p1, Ld33/h1;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ld33/h1;->A:Lec3/h2;

    return-object p1

    :pswitch_1
    check-cast p1, Lt23/g2;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lt23/g2;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
