.class public final synthetic Lce/t;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Lce/t;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lce/t;

    const-string v4, "continuation(Laws/sdk/kotlin/runtime/config/profile/FileLine;Laws/sdk/kotlin/runtime/config/profile/Token$Section;Laws/sdk/kotlin/runtime/config/profile/Token$Property;)Laws/sdk/kotlin/runtime/config/profile/Token$Continuation;"

    const/4 v5, 0x1

    const/4 v1, 0x3

    const-class v2, Lce/w;

    const-string v3, "continuation"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lce/t;->w:Lce/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/m;

    check-cast p2, Lce/z;

    check-cast p3, Lce/y;

    const-string p2, "p0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lce/w;->D(Lce/m;Lce/y;)Lce/x;

    move-result-object p1

    return-object p1
.end method
