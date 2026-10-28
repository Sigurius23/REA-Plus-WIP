.class public final Lt93/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt93/b;
.implements Lt93/d;


# static fields
.field public static final b:Lt93/a;

.field public static final c:Lt93/a;

.field public static final d:Lt93/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lt93/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt93/a;-><init>(I)V

    sput-object v0, Lt93/a;->b:Lt93/a;

    new-instance v0, Lt93/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lt93/a;-><init>(I)V

    sput-object v0, Lt93/a;->c:Lt93/a;

    new-instance v0, Lt93/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lt93/a;-><init>(I)V

    sput-object v0, Lt93/a;->d:Lt93/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lt93/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lva3/h;Lr93/e;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "classDescriptor"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public b(Lr93/e;)Ljava/util/Collection;
    .locals 0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public c(Lr93/e;)Ljava/util/Collection;
    .locals 0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public d(Lr93/e;)Ljava/util/Collection;
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public e(Lr93/e;Ljb3/t;)Z
    .locals 1

    iget v0, p0, Lt93/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object p1

    sget-object p2, Lt93/e;->a:Lva3/e;

    invoke-interface {p1, p2}, Ls93/i;->J(Lva3/e;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1

    :pswitch_0
    const-string p2, "classDescriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
