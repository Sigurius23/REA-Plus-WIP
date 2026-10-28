.class final Lr22/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu22/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr22/b;->define()Ltf3/a;
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
.field public static final a:Lr22/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr22/b$b;

    invoke-direct {v0}, Lr22/b$b;-><init>()V

    sput-object v0, Lr22/b$b;->a:Lr22/b$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
