.class final Ldj0/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj0/b;->u(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
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
.field public static final w:Ldj0/b$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldj0/b$i;

    invoke-direct {v0}, Ldj0/b$i;-><init>()V

    sput-object v0, Ldj0/b$i;->w:Ldj0/b$i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/y0;)V
    .locals 1

    const-string v0, "$this$smsMfaSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p1, Lre/y0;->a:Z

    iput-boolean v0, p1, Lre/y0;->b:Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lre/y0;

    invoke-virtual {p0, p1}, Ldj0/b$i;->a(Lre/y0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
