.class public final synthetic Lr93/u;
.super Lkotlin/jvm/internal/x;
.source "SourceFile"


# static fields
.field public static final w:Lr93/u;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lr93/u;

    const-string v1, "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;"

    const/4 v2, 0x0

    const-class v3, Lva3/c;

    const-string v4, "outerClassId"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lr93/u;->w:Lr93/u;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lva3/c;

    invoke-virtual {p1}, Lva3/c;->e()Lva3/c;

    move-result-object p1

    return-object p1
.end method
