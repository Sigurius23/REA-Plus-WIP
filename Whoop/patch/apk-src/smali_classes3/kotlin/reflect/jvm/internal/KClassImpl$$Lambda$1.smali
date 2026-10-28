.class Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/m;


# static fields
.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$1;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$1;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$1;->INSTANCE:Lkotlin/reflect/jvm/internal/KClassImpl$$Lambda$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhb3/x;

    check-cast p2, Lqa3/k0;

    invoke-static {p1, p2}, Lkotlin/reflect/jvm/internal/KClassImpl;->accessor$KClassImpl$lambda1(Lhb3/x;Lqa3/k0;)Lr93/n0;

    move-result-object p1

    return-object p1
.end method
