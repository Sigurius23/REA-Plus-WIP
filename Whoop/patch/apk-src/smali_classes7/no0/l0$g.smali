.class public final Lno0/l0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lno0/l0;->y0(Llo0/i0;Llo0/h0;Ll1/w3;Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Lno0/l0$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lno0/l0$g;

    invoke-direct {v0}, Lno0/l0$g;-><init>()V

    sput-object v0, Lno0/l0$g;->w:Lno0/l0$g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lry0/d;",
            ")",
            "Ljava/lang/Void;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lno0/l0$g;->a(Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
