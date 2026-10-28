.class public final Lb30/m5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lb30/m5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb30/m5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb30/m5;->w:Lb30/m5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Li3/z;

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Li3/x;->a(Li3/z;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
