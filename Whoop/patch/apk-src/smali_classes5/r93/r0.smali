.class public final Lr93/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lr93/v0;

.field public static final synthetic e:[Lj93/z;


# instance fields
.field public final a:Lu93/b;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lkb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lr93/r0;

    const-string v2, "scopeForOwnerModule"

    const-string v3, "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lr93/r0;->e:[Lj93/z;

    new-instance v0, Lr93/v0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lr93/v0;-><init>(I)V

    sput-object v0, Lr93/r0;->d:Lr93/v0;

    return-void
.end method

.method public constructor <init>(Lu93/b;Lkb3/n;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr93/r0;->a:Lu93/b;

    iput-object p3, p0, Lr93/r0;->b:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lfa3/u;

    const/16 p3, 0xd

    invoke-direct {p1, p0, p3}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    check-cast p2, Lkb3/k;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lkb3/i;

    invoke-direct {p3, p2, p1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Lr93/r0;->c:Lkb3/i;

    return-void
.end method
