.class Lkotlin/reflect/jvm/internal/KTypeParameterImpl$$Lambda$0;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field private final arg$0:Lr93/x0;


# direct methods
.method public constructor <init>(Lr93/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/KTypeParameterImpl$$Lambda$0;->arg$0:Lr93/x0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KTypeParameterImpl$$Lambda$0;->arg$0:Lr93/x0;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/KTypeParameterImpl;->accessor$KTypeParameterImpl$lambda0(Lr93/x0;)Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;

    move-result-object v0

    return-object v0
.end method
