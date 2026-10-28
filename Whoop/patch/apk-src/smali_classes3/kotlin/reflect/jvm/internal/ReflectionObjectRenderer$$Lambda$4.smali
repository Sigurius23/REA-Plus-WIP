.class Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer$$Lambda$4;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field private final arg$0:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer$$Lambda$4;->arg$0:Z

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer$$Lambda$4;->arg$0:Z

    check-cast p1, Lj93/d0;

    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;->accessor$ReflectionObjectRenderer$lambda4(ZLj93/d0;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
