.class public final synthetic Lp6/q1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lp6/q1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lp6/q1;

    const-string v4, "<init>()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lp6/w;

    const-string v3, "<init>"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lp6/q1;->w:Lp6/q1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lp6/w;

    invoke-direct {v0}, Lp6/w;-><init>()V

    return-object v0
.end method
