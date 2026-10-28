.class Lkotlin/reflect/jvm/internal/KClassImpl$Data$$Lambda$20;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field private final arg$0:Llb3/y;

.field private final arg$1:Lkotlin/reflect/jvm/internal/KClassImpl;


# direct methods
.method public constructor <init>(Llb3/y;Lkotlin/reflect/jvm/internal/KClassImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/KClassImpl$Data$$Lambda$20;->arg$0:Llb3/y;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/KClassImpl$Data$$Lambda$20;->arg$1:Lkotlin/reflect/jvm/internal/KClassImpl;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KClassImpl$Data$$Lambda$20;->arg$0:Llb3/y;

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/KClassImpl$Data$$Lambda$20;->arg$1:Lkotlin/reflect/jvm/internal/KClassImpl;

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/KClassImpl$Data;->accessor$KClassImpl$Data$lambda20(Llb3/y;Lkotlin/reflect/jvm/internal/KClassImpl;)Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
