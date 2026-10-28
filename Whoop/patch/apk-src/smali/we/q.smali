.class public final synthetic Lwe/q;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lwe/q;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lwe/q;

    const-string v4, "<init>()V"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Llf/c;

    const-string v3, "<init>"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lwe/q;->w:Lwe/q;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    new-instance v0, Llf/c;

    invoke-direct {v0}, Llf/c;-><init>()V

    return-object v0
.end method
