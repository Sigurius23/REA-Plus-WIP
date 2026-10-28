.class public final Lo93/a;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# static fields
.field public static final x:Lo93/a;

.field public static final y:Lo93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lo93/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo93/a;-><init>(I)V

    sput-object v0, Lo93/a;->x:Lo93/a;

    new-instance v0, Lo93/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo93/a;-><init>(I)V

    sput-object v0, Lo93/a;->y:Lo93/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lo93/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lo93/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lo93/e;

    new-instance v1, Lkb3/k;

    const-string v2, "DefaultBuiltIns"

    invoke-direct {v1, v2}, Lkb3/k;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lo93/h;-><init>(Lkb3/k;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo93/h;->c(Z)V

    return-object v0

    :pswitch_0
    sget-object v0, Lo93/b;->a:Lo93/b;

    const-class v0, Lo93/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/s;->G0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo93/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
