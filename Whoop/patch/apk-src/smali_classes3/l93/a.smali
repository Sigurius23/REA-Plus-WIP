.class public final synthetic Ll93/a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Ll93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ll93/a;

    const-string v4, "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;"

    const/4 v5, 0x0

    const/4 v1, 0x2

    const-class v2, Lhb3/x;

    const-string v3, "loadFunction"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Ll93/a;->w:Ll93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lhb3/x;

    check-cast p2, Lqa3/c0;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lhb3/x;->f(Lqa3/c0;)Ljb3/t;

    move-result-object p1

    return-object p1
.end method
