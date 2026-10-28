.class public final Loa3/s;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Loa3/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Loa3/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Loa3/s;->w:Loa3/s;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "L"

    const/16 v1, 0x3b

    invoke-static {v1, v0, p1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method
