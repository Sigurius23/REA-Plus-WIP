.class public Lpg3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;


# static fields
.field public static final x:Lpg3/b;

.field public static final y:Lpg3/b;

.field public static final z:Lpg3/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lpg3/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpg3/b;-><init>(I)V

    sput-object v0, Lpg3/b;->x:Lpg3/b;

    new-instance v0, Lpg3/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lpg3/b;-><init>(I)V

    sput-object v0, Lpg3/b;->y:Lpg3/b;

    new-instance v0, Lpg3/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lpg3/b;-><init>(I)V

    sput-object v0, Lpg3/b;->z:Lpg3/b;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpg3/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;)Ljava/util/List;
    .locals 1

    new-instance v0, Lpg3/r;

    invoke-direct {v0, p1}, Lpg3/r;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public c(Ljava/lang/reflect/Method;I)Ljava/lang/String;
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "parameter #"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpg3/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lud3/a1;

    invoke-virtual {p1}, Lud3/a1;->close()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lud3/v0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public e(Ljava/lang/reflect/Method;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
